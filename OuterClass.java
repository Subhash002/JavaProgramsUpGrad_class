public class OuterClass {
    private int outerData;

    public OuterClass(int data) {
        outerData = data;
    }

    // Inner class inside OuterClass
    class InnerClass {
        private int innerData;

        public InnerClass(int data) {
            innerData = data;
        }

        public void displayData() {
            System.out.println("Outer Data: " + outerData);
            System.out.println("Inner Data: " + innerData);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outer = new OuterClass(100);

        // Create an instance of the inner class using the outer class instance
        InnerClass inner = outer.new InnerClass(200);

        // Call the method of the inner class to display data
        inner.displayData();
    }
}
