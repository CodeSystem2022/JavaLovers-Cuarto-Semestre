#CODIGO DE ALEXA NAHUEL
#pruebas de la clase usuario
if __name__ == '__main__':
    # Eliminar usuario
     usuario = Usuario(id_usuario=3)
     usuario_eliminado = UsuarioDAO.eliminar(usuario)
     log.debug(f'Usuario eliminado: {usuario_eliminado}')

    # Modificar usuario
     usuario = Usuario(id_usuario=1, username='', password='369')
     usuario_modificado = UsuarioDAO.actualizar(usuario)
     log.debug(f'Usuario modificado: {usuario_modificado}')

    # Insertar usuario
     usuario = Usuario(username='kely', password='321')
     usuario_insertado = UsuarioDAO.insertar(usuario)
     log.debug(f'Usuario insertado: {usuario_insertado}')

    # Listar o seleccionar
     usuarios = UsuarioDAO.seleccionar()
     for usuario in usuarios:
        log.debug(usuario)

#codigo por Alexa Nahuel
#MENU_APP_USUARIO
opcion = None
while opcion != 5:
    print('Opciones: ')
    print('1. Listar Usuarios')
    print('2. Agregar Usuario')
    print('3. Modificar Usuario')
    print('4. Eliminar Usuario')
    print('5. Salir')
    opcion = int(input('Digite la opcion (1-5): '))
