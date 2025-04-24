package basics;

public class StringBufferAndStringBuilderExample {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer("Hello ");
        //System.out.println(buffer.capacity());
        //buffer.append("World");
        //System.out.println(buffer);
        //System.out.println(buffer.capacity());
        for(int i=0;i<10000;i++){
            buffer.append("World");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime));

        long startTime2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Hello ");
        //System.out.println(builder.capacity());
        //builder.append("World");
        //System.out.println(builder);
        //System.out.println(builder.capacity());
        for (int i=0;i<10000;i++){
            builder.append("World");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis()- startTime2));

        // StringBuffer is takes more time than StringBuilder because StringBuffer is synchronized

        // Methods of StringBuffer and StringBuilder
        // StringBuffer append()
        // StringBuffer delete()
        // StringBuffer deleteCharAt()
        // StringBuffer insert()
        // StringBuffer reverse()
    }
}
