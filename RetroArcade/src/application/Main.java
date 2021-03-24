//--module-path "\path\to\javafx-sdk-15.0.1\lib" --add-modules javafx.controls,javafx.fxml
package application;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class Main extends Application {
	 Pane root = new Pane();
	//private BorderPane root = new BorderPane();
    public Parent createContent() {
        //Pane root = new Pane();
    	// root = (BorderPane) new Pane();
        root.setPrefSize(860, 600);

        try (InputStream is = Files.newInputStream(Paths.get("ngc6357.jpg"))) {
            ImageView img = new ImageView(new Image(is));
            img.setFitWidth(860);
            img.setFitHeight(600);
            root.getChildren().add(img);
        }
        catch (IOException e) {
            System.out.println("Couldn't load image");
        }

        Title title = new Title(" Retro Arcade ");
        title.setTranslateX(75);
        title.setTranslateY(200);

        MenuItem itemSpaceInvaders = new MenuItem("SpaceInvaders");
        itemSpaceInvaders.setOnMouseClicked(event -> System.exit(0));
        
        MenuItem itemPong = new MenuItem("Pong");
        itemPong.setOnMouseClicked(event -> System.exit(0));
        
        MenuItem itemSnake = new MenuItem("Snake");
        itemSnake.setOnMouseClicked(event -> System.exit(0));
        
        MenuItem itemAdventure = new MenuItem("Adventure");
        itemAdventure.setOnMouseClicked(event -> { adventureGame game = new adventureGame(); itemAdventure.getScene().setRoot(root);
        });
        
        MenuItem itemExit = new MenuItem("EXIT");
        itemExit.setOnMouseClicked(event -> System.exit(0));
        

        MenuBox menu = new MenuBox(
                itemSpaceInvaders,
                itemPong,
                itemSnake,
                itemAdventure,
                itemExit);
        menu.setTranslateX(100);
        menu.setTranslateY(300);

        root.getChildren().addAll(title, menu);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Retro Arcade");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static class Title extends StackPane {
        public Title(String name) {
            Rectangle bg = new Rectangle(300, 70);
            bg.setStroke(Color.WHITE);
            bg.setStrokeWidth(5);
            bg.setFill(null);

            Text text = new Text(name);
            text.setFill(Color.WHITE);
            text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.BOLD, 50));

            setAlignment(Pos.CENTER);
            getChildren().addAll(bg, text);
        }
    }

    private static class MenuBox extends VBox {
        public MenuBox(MenuItem... items) {
            getChildren().add(createSeparator());

            for (MenuItem item : items) {
                getChildren().addAll(item, createSeparator());
            }
        }

        private Line createSeparator() {
            Line sep = new Line();
            sep.setEndX(200);
            sep.setStroke(Color.DARKGREY);
            return sep;
        }
    }

    private static class MenuItem extends StackPane {
        public MenuItem(String name) {
            LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, new Stop[] {
                    new Stop(0, Color.DARKVIOLET),
                    new Stop(0.1, Color.BLACK),
                    new Stop(0.9, Color.BLACK),
                    new Stop(1, Color.DARKVIOLET)
            });

            Rectangle bg = new Rectangle(200, 30);
            bg.setOpacity(0.4);

            Text text = new Text(name);
            text.setFill(Color.DARKGREY);
            text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 30));

            setAlignment(Pos.CENTER);
            getChildren().addAll(bg, text);

            setOnMouseEntered(event -> {
                bg.setFill(gradient);
                text.setFill(Color.WHITE);
            });


            setOnMouseExited(event -> {
                bg.setFill(Color.BLACK);
                text.setFill(Color.DARKGREY);
            });

            setOnMousePressed(event -> {
                bg.setFill(Color.DARKVIOLET);
            });

            setOnMouseReleased(event -> {
                bg.setFill(gradient);
            });
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}