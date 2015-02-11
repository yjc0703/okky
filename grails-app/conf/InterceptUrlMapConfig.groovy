
grails.plugin.springsecurity.interceptUrlMap = [
    '/':                        ['permitAll'],
    '/index':                   ['permitAll'],
    '/index.*':                 ['permitAll'],
    '/**/assets/**':            ['permitAll'],
    '/**/favicon.ico':          ['permitAll'],
    '/login/**':                ['permitAll'],
    '/logout/**':               ['permitAll'],
    '/dbconsole/**':            ['permitAll'],
    '/dbdoc/**':                ['permitAll'],

    '/articles/*':              ['permitAll'],
    '/articles/*/create':       ['ROLE_USER'],
    '/articles/*/save':         ['ROLE_USER'],

    '/article/*':               ['permitAll'],
    '/article/*/**':            ['ROLE_USER'],

    '/content/**':              ['ROLE_USER'],

    '/user/**':                 ['permitAll'],

    '/user/edit':               ['ROLE_USER'],
    '/user/update':             ['ROLE_USER'],

    '/find/user/**':             ['permitAll'],

    '/notification':            ['ROLE_USER'],
    '/notification.*':          ['ROLE_USER'],
    '/notification/*/**':       ['ROLE_USER'],

    '/oauth/**':                ['permitAll'],

    '/intro/**':                ['permitAll'],

    '/_admin/**':               ['ROLE_ADMIN']
]