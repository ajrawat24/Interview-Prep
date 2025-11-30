package Top56Program;
class AmitKumarSinghPWC {
    public static void main(String[] args) {

        String s = "Amit Singh Rawat";
        String[] parts = s.split(" ");

        // Build final output
        StringBuilder sb = new StringBuilder();
        sb.append(parts[0].charAt(0)).append('.');
        sb.append(parts[1].charAt(0)).append('.');
        sb.append(parts[2]);
        System.out.println(sb.toString());
    }
}