public class Park {
    entertainment entertainmentBlockA = new entertainment("Колесо Обозрения", 20, 500);

    static class entertainment {

        public String attractionInformation;
        public int workingTime;
        public int price;

        public entertainment(String attractionInformation, int workingTime, int price) {
            this.attractionInformation = attractionInformation;
            this.workingTime = workingTime;
            this.price = price;
        }
    }

}
