import org.apache.spark.sql.SparkSession;

public class Session {
    SparkSession sparkSession = SparkSession.builder().appName("appname").config("key", "value").getOrCreate();


    public static SparkSession get() {
        SparkSession sparkSession = SparkSession.builder().appName("appname").getOrCreate();
        System.out.println(sparkSession);
        return sparkSession;

    }
}
