class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, String> seen = new HashMap<String, String>();
        
        for (String email: emails) {
            int arrobaIndex = email.indexOf("@");
            String localName = email.substring(0, arrobaIndex);
            
            localName = localName.replace(".", "");
            
            
            int plusSignIndexOf = localName.indexOf('+');
            if (plusSignIndexOf > -1) {
                localName = localName.substring(0, plusSignIndexOf);
            }

            String emailToSent = localName + email.substring(arrobaIndex);
            seen.put(emailToSent, emailToSent );
        }
        
        return seen.size();
    }

}