/* C code below */
#include <math.h>

double closest_to_zero(double ts[], int size)
{
    int i; double closest;
    if(size == 0)
        return 0;
    closest = ts[0];
    for(i=1; i<size; i++) {
        if(abs(ts[i]) < abs(closest)) {
            closest = ts[i];
        } else if(abs(ts[i]) == abs(closest) && ts[i] > 0) {
            closest = ts[i];
        }
    }
    return closest;
}