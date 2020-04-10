package czq.czqsole.domain;

/**
 * Author: czqsole
 * Date: 2018/6/13
 */
public class User {
    private String name;
    private Integer id;

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
