public class RealEstateManagement {
    public static class Property {
        private String address;
        private double price;
        private String propertyType;
        private int size;
        public Property(String address, double price, String propertyType, int size) {
            this.address = address;
            this.price = price;
            this.propertyType = propertyType;
            this.size = size;
        }
        public String getAddress() {
            return address;
        }
        public double getPrice() {
            return price;
        }
        public String getPropertyType() {
            return propertyType;
        }
        public int getSize() {
            return size;
        }
        public String toString() {
            return "Property(Address: " + address + ", Price: " + price + ", Type: " + propertyType + ", Size: " + size + " sqft)";
        }
    }
    public static class Agent {
        private String name;
        private String phone;
        private int experience;
        public Agent(String name, String phone, int experience) {
            this.name = name;
            this.phone = phone;
            this.experience = experience;
        }
        public String getName() {
            return name;
        }
        public String getPhone() {
            return phone;
        }
        public int getExperience() {
            return experience;
        }
        public String toString() {
            return "Agent(Name: " + name + ", Phone: " + phone + ", Experience: " + experience + " years)";
        }
    }
    public static class RealEstateAgency {
        private String name;
        private String address;
        public RealEstateAgency(String name, String address) {
            this.name = name;
            this.address = address;
        }
        public String getName() {
            return name;
        }
        public String getAddress() {
            return address;
        }
        public String toString() {
            return "RealEstateAgency(Name: " + name + ", Address: " + address + ")";
        }
    }
    public static void main(String[] args) {
        Property house = new Property("123 Elm Street", 2500000, "House", 1800);
        Property apartment = new Property("456 Oak Avenue", 1750000, "Apartment", 1200);
        Agent agent1 = new Agent("John Doe", "5555555", 5);
        RealEstateAgency agency = new RealEstateAgency("Dream Homes", "123 Main Street");
        System.out.println(agency);
        System.out.println(agent1);
        System.out.println(house);
        System.out.println(apartment);
    }
}
