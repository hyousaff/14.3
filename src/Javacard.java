// Hamza Yousaf
// Chapter 14, Ex 14.3
//This application, creates an array with numbers 1 to 52, shuffles the contents
// and then chooses the first 3 array elements to get the filename for
//card images to be displayed

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;





public class Javacard extends Application{

    int array[]; //array to store numbers from 1 to 52



    @Override public void start(Stage stage) {



        createAndShuffleArray();



        int filenum;

        String filepath;



        HBox box = new HBox(); //a horizontal box to hold the 3 images

        //go over only the first 3 elements

        for(int i=0; i<3;i++)

        {

            filenum=array[i];

            filepath="image/card/"+filenum+".png"; //construct the path to file of choosen card number



            // load the image in a image view and add it to the box

            Image image = new Image(filepath);



            ImageView iv = new ImageView();

            iv.setImage(image);

            box.getChildren().add(iv);

        }



        Group root = new Group();

        Scene scene = new Scene(root);

        scene.setFill(Color.BLACK);



        root.getChildren().add(box);

        stage.setTitle("Card shuffle display");

        stage.setWidth(715);

        stage.setHeight(400);

        stage.setScene(scene);

        stage.sizeToScene();

        stage.show();

    }

    //creates an array of size 52 and stores numbers 1 to 52 in it. later shuffles the contents of array

    private void createAndShuffleArray()

    {

        int j,temp;

        int N=5;

        Random random=new Random(); //used for random number generation



        array=new int[N];

        //store numbers 1 to N sequentially in the array first

        for(int i=0;i<N;i++)

            array[i]=i+1;

        //now shuffle the contents in array

        for(int i=0;i<N;i++)

        {

            j=random.nextInt(N); //generate a random index from 0-N-1



            //swap numbers in index i and j

            temp=array[i];

            array[i]=array[j];

            array[j]=temp;



        }

    }

    public static void main(String[] args) {

        Application.launch(args);

    }

}

