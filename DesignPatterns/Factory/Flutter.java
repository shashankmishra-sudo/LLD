package DesignPatterns.Factory;

public class Flutter {
    private SupportedPlateform supportedPlateform;

    public Flutter(SupportedPlateform supportedPlateform) {
        this.supportedPlateform = supportedPlateform;
    }

    public void setTheme(){
        System.out.println("Theme has been changed");
    }
    public UIFactory createUIFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlateform);
    }
}
