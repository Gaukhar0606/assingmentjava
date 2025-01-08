
public class RealEstateManagement {

    // Property Class
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

        @Override
        public String toString() {
            return "Property(Address: " + address + ", Price: " + price + ", Type: " + propertyType + ", Size: " + size + " sqft)";
        }
    }

    // Agent Class
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

        @Override
        public String toString() {
            return "Agent(Name: " + name + ", Phone: " + phone + ", Experience: " + experience + " years)";
        }
    }

    // RealEstateAgency Class
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

        @Override
        public String toString() {
            return "RealEstateAgency(Name: " + name + ", Address: " + address + ")";
        }
    }

    public static void main(String[] args) {
        // Create Properties
        Property house = new Property("123 Elm Street", 2500000, "House", 1800);
        Property apartment = new Property("456 Oak Avenue", 1750000, "Apartment", 1200);

        // Create Agent
        Agent agent1 = new Agent("John Doe", "555-1234", 5);

        // Create RealEstateAgency
        RealEstateAgency agency = new RealEstateAgency("Dream Homes", "123 Main Street");

        // Display Details
        System.out.println(agency);
        System.out.println(agent1);
        System.out.println(house);
        System.out.println(apartment);
    }
}
