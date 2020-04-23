package sixtharraypackage;

public class MovieEvaluator {
    public static void main(String[] args) {
        movieEvaluate(8, 819, 190);

    }
    public static void movieEvaluate(int imdb, int totalVotes, int boxOffice){
        if(imdb*totalVotes/boxOffice>10){
            System.out.println("Watch the movie");

        }else{
            System.out.println("I do not advice");
        }
    }

}
