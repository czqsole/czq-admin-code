package czq.czqsole.service.autochess.impl;

import czq.czqsole.dao.BuffMapper;
import czq.czqsole.dao.ChessMapper;
import czq.czqsole.domain.Buff;
import czq.czqsole.domain.BuffSo;
import czq.czqsole.domain.Chess;
import czq.czqsole.domain.result.BaseResult;
import czq.czqsole.service.autochess.ChessService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

/**
 * Author: BG366783
 * Date: 2019-03-03 02:45
 */
@Component
public class ChessServiceImpl implements ChessService {

    private List<String> classNameList = Arrays.asList("战士", "术士", "暗影萨吗", "骑士", "猎人", "工匠", "法师", "恶魔猎手", "德鲁伊", "刺客");

    private List<String> specialNameList = Arrays.asList("元素", "野兽", "亡灵", "兽人", "食人魔", "人类", "龙", "娜迦", "精灵", "恶魔", "地精", "矮人");

    @Resource
    ChessMapper chessMapper;

    @Resource
    BuffMapper buffMapper;

    @Override
    public BaseResult getAllBuffInfoByChesses(List<Chess> chessList) {

        Map<String, Integer> classMap = new HashMap<>();
        Map<String, Integer> specialMap = new HashMap<>();
        Map<String, List<String>> classNameMap = new HashMap<>();
        for (Chess chess: chessList) {
            if(chess == null) {
                continue;
            }
            addIntegerMap(chess.getClassName(), classMap);
            addIntegerMap(chess.getSpecial(), specialMap);

            addListmap(chess.getClassName(), classNameMap, chess.getName());
            addListmap(chess.getSpecial(), classNameMap, chess.getName());
        }

        printChessInfo(classNameMap);
        System.out.println("Buff效果");
        getBuffInfo(classMap);
        getBuffInfo(specialMap);
        
        return new BaseResult();
    }

    private void addIntegerMap(String key, Map<String, Integer> map) {
        Integer value = map.get(key);
        if(value == null) {
            value = 0;
        }
        value++;
        map.put(key, value);
    }

    private <T> void addListmap(String key, Map<String, List<T>> map, T value) {
        List<T> list = map.get(key);
        if(list == null) {
            list = new ArrayList<T>();
        }
        list.add(value);
        map.put(key, list);
    }


    private void getBuffInfo(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            BuffSo so = new BuffSo();
            so.setSpecialOrClass(entry.getKey());
            so.setMaxBuffNum(entry.getValue());
            List<Buff> buffList = buffMapper.selectBySo(so);
            for (Buff buff: buffList) {
                System.out.println(buff.toString());
            }
        }
    }

    private void printChessInfo(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            String classNameOrSpecial = entry.getKey();
            List<String> nameList = entry.getValue();
            System.out.println("[" + classNameOrSpecial + "]: " + list2String(nameList));
        }
    }

    private String list2String(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for(String value: list) {
            sb.append(value).append(",");
        }
        if(sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
