    class Solution {
        public int numUniqueEmails(String[] emails) {
            HashMap<String, String> seen = new HashMap<String, String>();
            
            for (String email: emails) {
                String emailToSend = this.formatEmail(email);
                seen.put(emailToSend, emailToSend );
            }
            
            return seen.size();
        }

        
        private String formatEmail(String email) {
            int index = 0;
            StringBuilder formattedEmail = new StringBuilder();
            while(email.charAt(index) != '@' ){ 
                if (email.charAt(index) == '+' ) {
                    index++;
                    break;
                } else if (email.charAt(index) != '.' ) {
                    formattedEmail.append(email.charAt(index));
                }
                index++;

            }
            
            
            while(email.charAt(index) != '@' ){ 
                index++;
            }
            
            while(index < email.length()) {
                formattedEmail.append(email.charAt(index));
                index++;
            }
            
            return formattedEmail.toString();
        }

    }


    class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
            int result = solution.numUniqueEmails(emails);
            System.out.println(result);
        }
    }