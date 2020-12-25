/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    
    if(s == "") return false; 
    if(s.length == 1) return false; 
    let stack = []
    
    let hash = {
        "(":")",
        "{":"}",
        "[":"]"
    }
    
    for(char of s){
        if(char in hash){
            stack.push(char)
        } else {
            if(stack.length == 0) return false
            last = stack.pop();
            if(hash[last] !== char) return false;
        }
    }
    
    if(stack.length > 0) return false;
    return true;
};