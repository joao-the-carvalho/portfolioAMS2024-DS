import timeit
from numba import jit

@jit(nopython=True)
def count_to_number(limit):
    num = 0
    while num <= limit:
        num += 1
    return num

def measure_time(limit):
    start = timeit.default_timer()
    count_to_number(limit)
    stop = timeit.default_timer()
    return stop - start

limit = 1234567890
execution_time = measure_time(limit)
print(f"Time taken to count to {limit}: {execution_time} seconds")
