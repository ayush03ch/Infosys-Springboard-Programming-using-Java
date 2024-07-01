interface Testable {
    boolean testCompatibility();
}

class Mobile {
    private String name;
    private String brand;
    private String operatingSystemName;
    private String operatingSystemVersion;

    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }
}

class SmartPhone extends Mobile implements Testable {
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    public String getNetworkGeneration() {
        return networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }

    @Override
    public boolean testCompatibility() {
        ArrayList<String> versionList = new ArrayList<>();
        if (this.operatingSystemName.equals("Saturn")) {
            if (this.networkGeneration.equals("3G")) Collections.addAll(versionList, "EXRT.1", "EXRT.2", "EXRU.1");
            else if (this.networkGeneration.equals("4G")) Collections.addAll(versionList, "EXRT.2", "EXRU.1");
            else if (this.networkGeneration.equals("5G")) Collections.addAll(versionList, "EXRU.1");
        } else if (this.operatingSystemName.equals("Gara")) {
            if (this.networkGeneration.equals("3G")) Collections.addAll(versionList, "1.1", "1.2", "1.3");
            else if (this.networkGeneration.equals("4G")) Collections.addAll(versionList, "1.2", "1.3");
            else if (this.networkGeneration.equals("5G")) Collections.addAll(versionList, "1.3");
        }
        String OSV = this.getOperatingSystemVersion();
        return versionList.contains(OSV);
    }
}

class Tester {
    public static void main(String args[]) {
        SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
        if (smartPhone.testCompatibility())
            System.out.println("The mobile OS is compatible with the network generation!");
        else
            System.out.println("The mobile OS is not compatible with the network generation!");

        // Create more objects for testing your code
    }
}
