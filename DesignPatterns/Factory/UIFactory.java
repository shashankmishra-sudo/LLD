package DesignPatterns.Factory;

import DesignPatterns.Factory.componnents.Button.Button;
import DesignPatterns.Factory.componnents.Dropdown.DropDown;
import DesignPatterns.Factory.componnents.Menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button CreateButton();
    DropDown CreateDropdown();

}
