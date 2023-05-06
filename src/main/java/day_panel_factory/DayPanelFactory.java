package day_panel_factory;

/**
 * DayPanel factory 
 * @author Hicaro
 */
public class DayPanelFactory extends PanelFactory{
    private int index;
    
    /**
     * creates a new instance of DayPanelFactory and set the index that I want
     * my program to view
     * @param index API index
     */
    public DayPanelFactory(int index){
        this.index = index;
    }
    
    /**
     * creates a new DayPanel
     * @return DayPanel
     */
    @Override
    public DayPanel createPanel() {
        DayPanel panel = new DayPanel(this.index);
        return panel;
    }
}
