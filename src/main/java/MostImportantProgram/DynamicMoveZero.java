package MostImportantProgram;

public class DynamicMoveZero {
            public static void main(String[] args) {
                String[] arr = {"5", "11", "2", "111", "7", "1", "11", "8"};
            char target = '1';   // <-- Tomorrow you can change this to '5', '2', '0' etc.

            int left = 0;

            // Step 1: Move normal numbers to left
            for (int i = 0; i < arr.length; i++) {
                if (!isSpecial(arr[i], target)) {
                    arr[left++] = arr[i];
                }
            }

            // Step 2: Fill right side with special numbers
            while (left < arr.length) {
                arr[left++] = String.valueOf(target);
            }

            // Print output
            for (String s : arr) {
                System.out.print(s + " ");
            }
        }

        // ✅ Helper method to check if value consists only of repeated target digit
        public static boolean isSpecial(String value, char target) {
            for (char c : value.toCharArray()) {
                if (c != target) {
                    return false;
                }
            }
            return true;
        }
    }


