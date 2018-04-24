public class Json {
    public static void main(String[] args) {
        Session.get().read().json("/Users/fangzongzhou/workspace/javaLearnProject/spark/src/main/resources/people.json").show();
    }
}
