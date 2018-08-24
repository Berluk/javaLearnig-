import com.google.gson.GsonBuilder;

public class Gson {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Lukasz\",\"age\":21,\"high\" :185}";
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        com.google.gson.Gson gson = builder.create();
        Employee employee = gson.fromJson(jsonString, Employee.class);
        System.out.println(employee);
        jsonString = gson.toJson(employee);
        System.out.println(jsonString);
    }

    class Employee{
        private String name;
        private int age;
        private int high;

        public Employee() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name: " + name + '\'' +
                    ", age: " + age +
                    ", high: " + high +
                    '}';
        }
    }
}
