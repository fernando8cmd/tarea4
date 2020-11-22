def singleton(cls):

    instances = dict()

    def wrap(*args, **kwargs):
        if cls not in  instances:
            instances[cls] = cls(*args, **kwargs)

            return instances[cls]

            return wrap


@singleton            
class Usuario(object):
    def __init__(self, Nombre_Usuario):
        self.Nombre_Usuario = Nombre_Usuario

@singleton
class Admin():
    pass

if __name__ == '__main__':
    
    usuario1 = Usuario('Fernando')
    usuario2 = Usuario('Kelvin')

print (usuario1 is usuario2)
print (Admin1 is Admin 2)

