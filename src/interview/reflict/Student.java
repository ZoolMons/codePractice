package interview.reflict;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-24:2019
 * Des:
 */
public class Student {
    private String name;
    private String sex;
    private Integer age;
    public Integer height =19;

    public Student(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
