package entity;

/*
* */
public class Flower {
    private Long id;
    private String name;
    private String soil;
    private String origin;
    private VisualParameters visualParameters=new VisualParameters();
    private GrowingTips growingTips=new GrowingTips();
    private String multiplying;

    public Flower(){}

    public Flower(Long id,
            String name,
            String soil,
            String origin,
            VisualParameters visualParameters,
            GrowingTips growingTips,
            String multiplying){
        this.id=id;
        this.name=name;
        this.soil=soil;
        this.origin=origin;
        this.visualParameters=visualParameters;
        this.growingTips=growingTips;
        this.multiplying=multiplying;

    }



    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", soil='" + soil + '\'' +
                ", origin='" + origin + '\'' +
                ", visualParameters=" + visualParameters +
                ", growingTips=" + growingTips +
                ", multiplying='" + multiplying + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoil() {
        return soil;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VisualParameters getVisualParameters() {
        return visualParameters;
    }

    public void setVisualParameters(VisualParameters visualParameters) {
        this.visualParameters = visualParameters;
    }

    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    public void setGrowingTips(GrowingTips growingTips) {
        this.growingTips = growingTips;
    }

    public String getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    private static class GrowingTips{

        private int temperature;
        private String flowerLight;
        private double watering;

        public GrowingTips(){}
        public GrowingTips(int temperature, String flowerLight, double watering) {
            this.temperature = temperature;
            this.flowerLight = flowerLight;
            this.watering = watering;
        }

        @Override
        public String toString() {
            return "GrowingTips{" +
                    "temperature=" + temperature +
                    ", flowerLight='" + flowerLight + '\'' +
                    ", watering=" + watering +
                    '}';
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public String getFlowerLight() {
            return flowerLight;
        }

        public void setFlowerLight(String flowerLight) {
            this.flowerLight = flowerLight;
        }

        public double getWatering() {
            return watering;
        }

        public void setWatering(double watering) {
            this.watering = watering;
        }
    }


    private static class VisualParameters {
        private String colourStem;
        private String colourLeaf;
        private double middleSize;

        public VisualParameters(){}
        public VisualParameters(String colourStem, String colourLeaf, double middleSize) {
            this.colourStem = colourStem;
            this.colourLeaf = colourLeaf;
            this.middleSize = middleSize;
        }

        @Override
        public String toString() {
            return "VisualParameters{" +
                    "colourStem='" + colourStem + '\'' +
                    ", colourLeaf='" + colourLeaf + '\'' +
                    ", middleSize=" + middleSize +
                    '}';
        }

        public String getColourStem() {
            return colourStem;
        }

        public void setColourStem(String colourStem) {
            this.colourStem = colourStem;
        }

        public String getColourLeaf() {
            return colourLeaf;
        }

        public void setColourLeaf(String colourLeaf) {
            this.colourLeaf = colourLeaf;
        }

        public double getMiddleSize() {
            return middleSize;
        }

        public void setMiddleSize(double middleSize) {
            this.middleSize = middleSize;
        }
    }

}
