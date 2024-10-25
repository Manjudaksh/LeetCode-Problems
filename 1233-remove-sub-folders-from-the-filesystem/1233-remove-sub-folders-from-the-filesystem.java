class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);  // Sort the folder array
        List<String> result = new ArrayList<>();
        result.add(folder[0]);  // Add the first folder to the result list
        for (int i = 1; i < folder.length; i++) {
            String last = result.get(result.size() - 1) + "/";  // Get the last folder in the result list and add '/'
            if (!folder[i].startsWith(last)) {  // Check if the current folder is not a subfolder of the last folder
                result.add(folder[i]);  // If not a subfolder, add it to the result list
            }
        }
        return result;
    }
}