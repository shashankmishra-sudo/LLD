package DesignPatterns.Factory;

import DesignPatterns.Factory.componnents.Button.AndroidButton;
import DesignPatterns.Factory.componnents.Button.Button;
import DesignPatterns.Factory.componnents.Dropdown.AndroidDropdown;
import DesignPatterns.Factory.componnents.Dropdown.DropDown;
import DesignPatterns.Factory.componnents.Menu.AndroidMenu;
import DesignPatterns.Factory.componnents.Menu.Menu;

public class AndroidFactory implements UIFactory{

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button CreateButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown CreateDropdown() {
        return new AndroidDropdown();
    }
}
