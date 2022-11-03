from time import time

def raiseIndexError():
    # raise IndexError
    raise IndexError

def raiseZeroDivisionErrorWithMessage(message:str):
    # raisse the error with message
    raise ZeroDivisionError(message)

def raiseThisException(exception):
    raise exception # raise the exception

def catchAndReturnMessage(message:str, main_function:callable) -> str:
    # use a try except block
    try:
        main_function()
        return message   #corrected
    except Exception as e:
        # an exception occured
        return str(e)
    
def catchCleanupAndThrow(main_supplier:callable, index_supplier:callable, zero_supplier:callable, cleanup:callable) -> str:
    # try to run main_supplier
    try:
        return main_supplier()  #corrected
    except IndexError:
        # index error
        return index_supplier()  #corrected
    except ZeroDivisionError:
        return zero_supplier()   #corrected
    finally:
        # finally block gets executed
        # reagardless an exception is
        # thrown or not
        cleanup()

class Timer:
    def __init__(self, time_out:int):
        self.time_out = time_out
        self.start_time = None
        self.end_time = None
    def get_total_time(self):
        if self.end_time == None:
            return -1
        return self.end_time - self.start_time
    def __enter__(self):
        self.start_time = int(round(time.time() * 1000))
        return self
    def __exit__(self, exc_type, exc_value, traceback):
        self.end_time = time.time()
        if self.get_total_time() > self.time_out:
            raise TimeoutError

