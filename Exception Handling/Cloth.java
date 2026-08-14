class Cloth {
    void setMeasurement(int x) throws LongShirtException {
        if (x > 5)
            throw new LongShirtException();
        else
            System.out.println("Shirt is fit");
    }
}