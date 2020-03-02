// JavaScript code below
// Use printErr(...) to debug your solution.

function closestToZero(ts) {
    // Your code goes here
    if(ts.length == 0) {
        return 0
    }
    var closest = ts[0]
    var absClosest = Math.abs(closest)
    ts.forEach(element => {
        if(Math.abs(element) < absClosest) {
            closest = element
            absClosest = Math.abs(element) 
        } else if(Math.abs(element) == absClosest && element > 0) {
            closest = element
        }
        
    })
    return closest
}