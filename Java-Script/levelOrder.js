let levelOrder = function(root){      
    // If root is null return an empty array     
    if(!root) return []          
    // initialize the queue with root     
    const queue = [root]      
    // declare output array     
    const levels = []          
    while(queue.length !== 0){        
        const queueLength = queue.length 
        // Get the length prior to dequeueing        
        const currLevel = [] // Declare this level        
        // loop through to exhaust all options and only to include nodes at currLevel        
        for(let i = 0; i < queueLength; i++){            
            // Get next node            
            const current = queue.shift()                        
            if(current.left){                
                queue.push(current.left)            
            }            
            if(current.right){                
                queue.push(current.right)            
            }            
            // After we add left and right for current, we add to currLevel            
            currLevel.push(current.val)        
        }        
        // Level has been finished. Push into output array        
        levels.push(currLevel)    
    }     
    return levels 
}

