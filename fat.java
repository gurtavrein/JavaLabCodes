package lab;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;

public class fat extends Application {
@Override
public void start(Stage primaryStage) {
try {
    TabPane tabPane = new TabPane();

    Tab tab1 = new Tab("Veg", new Label("Select the options"));
    Tab tab2 = new Tab("Cheese"  , new Label("Select the options"));
    Tab tab3 = new Tab("Meat" , new Label("Select the options"));
    Tab tab4 = new Tab("Pepperoni" , new Label("Select the options"));

    tabPane.getTabs().add(tab1);
    tabPane.getTabs().add(tab2);
    tabPane.getTabs().add(tab3);
    tabPane.getTabs().add(tab4);
    
Text t1=new Text();
t1.setText("Size");
ComboBox c1 = new ComboBox();
c1.getItems().add("Small");
c1.getItems().add("Medium");
c1.getItems().add("Large");

Text t2 = new Text();
t2.setText("Base");
ComboBox c2 = new ComboBox();
c2.getItems().add("Hand tossed");
c2.getItems().add("Thin");
c2.getItems().add("Cheese burst");

Text t3 = new Text(); 
t3.setText("Toppings");
TextField t4 = new TextField();

Button btn = new Button(); btn.setText("Submit");

Text t5=new Text();
t5.setText("Tip");
TextField t6 = new TextField();

btn.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
    int p=0;
    Object v1 = tabPane.getSelectionModel().getSelectedItem();//tab selector
    Object v2 = c1.getSelectionModel().getSelectedItem();//size selector
    Object v3 = c2.getSelectionModel().getSelectedItem();//base selector
    Object v4 = t4.getText();
    
    if(v1==tab1){
        p=p+100;
    }
    else if(v1==tab2){
    p=p+150;
    }
    //similarly for all tabs
    if(v2=="Small"){
        p=p+50;
    }
    //similarly for all size,base and toppings
    
    System.out.println("PRICE  "+p);

}
});
GridPane root = new GridPane();
root.addRow(0, tabPane);
root.addRow(1, t1, c1);
root.addRow(2, t2, c2);
root.addRow(3, t3, t4);
root.addRow(4, t5,t6);
root.addRow(5,btn);
Scene scene = new Scene(root, 400, 400);
primaryStage.setTitle("CSE3099");
primaryStage.setScene(scene);
primaryStage.show();
} catch (Exception e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
launch(args);
}
}
