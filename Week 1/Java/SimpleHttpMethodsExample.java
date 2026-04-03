import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHttpMethodsExample {
    public static void main(String[] args) {
        try {
            // Replace with your API endpoint URL
            String baseUrl = "https://api.example.com/resources";

            // GET request
            System.out.println("GET Request:");
            sendGetRequest(baseUrl);

            // POST request
            System.out.println("\nPOST Request:");
            String postData = "data=newresource";
            sendPostRequest(baseUrl, postData);

            // PUT request
            System.out.println("\nPUT Request:");
            String putData = "data=updatedresource";
            sendPutRequest(baseUrl + "/1", putData); // Assuming resource ID is 1

            // DELETE request
            System.out.println("\nDELETE Request:");
            sendDeleteRequest(baseUrl + "/1"); // Assuming resource ID is 1
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendGetRequest(String urlString) throws IOException {
        URL urlObj = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        // You can read the response body here if needed
    }

    private static void sendPostRequest(String url, String data) throws IOException {
        URL urlObj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        writeData(conn, data);
        System.out.println("Response Code: " + conn.getResponseCode());
        // You can read the response body here if needed
    }

    private static void sendPutRequest(String url, String data) throws IOException {
        URL urlObj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
        conn.setRequestMethod("PUT");
        conn.setDoOutput(true);
        writeData(conn, data);
        System.out.println("Response Code: " + conn.getResponseCode());
        // You can read the response body here if needed
    }

    private static void sendDeleteRequest(String url) throws IOException {
        URL urlObj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
        conn.setRequestMethod("DELETE");
        System.out.println("Response Code: " + conn.getResponseCode());
        // You can read the response body here if needed
    }

    // Helper method to write data to the connection
    private static void writeData(HttpURLConnection conn, String data) throws IOException {
        try (OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream())) {
            writer.write(data);
            writer.flush();
            writer.close();
        }
    }
}