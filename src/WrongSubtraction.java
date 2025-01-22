import java.io.IOException;
import java.util.Scanner;

public class WrongSubtraction {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       System.out.println(divideWatermelon(sc.nextInt()));

    }

    public static String divideWatermelon(int num){

        if(num > 2 && num % 2 == 0){
            return "YES";
        }else return "NO";
    }

    public class VisionApiExample {

public static void main(String[] args) throws Exception {

// Path to the image file (use an absolute path or a relative one)

String imagePath = "path/to/your/image.jpg";

GOOGLE_APPLICATION_CREDENTIALS environment variable to the path of your service account key

GOOGLE_APPLICATION_CREDENTIALS="path/to/your/service-account-file.json"

// Call the Vision API to analyze the image

analyzeImage(imagePath);

}

public static void analyzeImage(String imagePath) throws IOException {

// Initialize ImageAnnotatorClient

try (ImageAnnotatorClient vision = ImageAnnotatorClient.create()) {

// Read the image file into a byte array

ByteString imgBytes = ByteString.readFrom(new FileInputStream(imagePath));

// Build the image object

Image img = Image.newBuilder().setContent(imgBytes).build();



// Build the request with the desired feature (LABEL_DETECTION)

Feature feature = Feature.newBuilder().setType(Feature.Type.LABEL_DETECTION).build();

AnnotateImageRequest request = AnnotateImageRequest.newBuilder()

.addFeatures(feature)

.setImage(img)

.build();

// Send the request to the Vision API

List<AnnotateImageResponse> responses = vision.batchAnnotateImages(List.of(request)).getResponsesList();

// Handle the response

for (AnnotateImageResponse response : responses) {

if (response.hasError()) {

System.out.printf("Error: %s%n", response.getError().getMessage());

return;

}

// Print out the detected labels

for (EntityAnnotation annotation : response.getLabelAnnotationsList()) {

System.out.printf("Label: %s (Confidence: %.2f)%n", annotation.getDescription(
    
}
