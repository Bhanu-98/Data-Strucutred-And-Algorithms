class Singleton {
    private static Singleton instance = null;

    public String s;

    private Singleton(){
        s = "Hello, I'm part of this singleton class";
    }

    public static Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        } 

        return instance;
    }
}

class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());
    }
}