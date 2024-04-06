package DesignPatterns.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlateform supportedPlateform){
        switch (supportedPlateform){
            case IOS:return new IOSFactory();
            case Android:return new AndroidFactory();
        }
        return null;
    }
}
