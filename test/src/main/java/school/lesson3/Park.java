package school.lesson3;

    /*3.Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
    информацию об аттракционах, времени их работы и стоимости.
     */
public class Park {
        public String address;
        public String employees;

        public class Attractions {
            public String attraction;
            public String workingHours;
            public int cost;

            public Attractions(String attraction, String workingHours, int cost) {
                this.attraction = attraction;
                this.workingHours = workingHours;
                this.cost = cost;
            }

            public void printInfo() {
                System.out.println(attraction + ", " + workingHours + ", " + cost);
            }
        }

      public static void main (String[] args) {
      Park.Attractions attraction1 = new Park().new Attractions("carousel", "8am - 20pm", 10);
      attraction1.printInfo();
        }
  }