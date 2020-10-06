public class Person {
    private Long nameId;
    private String name;



    public Person(Long nameId, String name) {
        this.nameId = nameId;
        this.name = name;
    }

    public Person() {

    }

    public Long getNameId() {
        return nameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
