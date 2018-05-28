public class MyGenerics<T> {

    T name;
    T id;

    public MyGenerics(T name, T id) {
        this.name = name;
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }


    public  <T> void display(){

        System.out.println("Name"+name+"Id"+id);
        }
        }



