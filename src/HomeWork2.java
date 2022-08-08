public class HomeWork2 {
        public  static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello World");
            System.out.println(deleteChars(builder));
        }

        static  StringBuilder deleteChars(StringBuilder builder){
            StringBuilder stringBuilder = new StringBuilder();
            char[] arr = {'a','e','u','i','o','y'};
            for (int i = 0; i < builder.length(); ++i) {
                int counter = 0;
                for (int j = 0; j < arr.length; ++j){
                    if (builder.charAt(i) == arr[j]) {
                        counter = 1;
                        break;
                    }
                }
                if (counter == 0) {
                    stringBuilder.append(builder.charAt(i));
                }
            }
            return  stringBuilder;
        }
}