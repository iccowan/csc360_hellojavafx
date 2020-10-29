package hellojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application
{
	Button btn;

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		btn = new Button();
		btn.setText("Hello");
		btn.setOnAction(e -> buttonClick());
		
		BorderPane pane = new BorderPane();
		pane.setCenter(btn);
		Scene scene = new Scene(pane, 300, 250);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello...World!");
		primaryStage.show();
	}
	
	public void buttonClick()
	{
		if (btn.getText() == "Hello")
		{
			btn.setText("World!");
		}
		else
		{
			btn.setText("Hello");
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}