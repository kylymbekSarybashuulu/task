public enum Enum {

    MYNDAY(1){
        @Override
        public void method() {
            System.out.println("duishombu java sabagyn okuim");
        }
    },


    TYESDAY(2){
        @Override
        public void method() {
            System.out.println("sheishembi anglis tili sabagyn okuim");
        }
    };


    private final int number ;

    Enum(int number) {
        this.number = number;
    }

    public abstract void method();
}
