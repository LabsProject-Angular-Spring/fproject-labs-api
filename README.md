# labs-api
 labs api for labs project

port: 10030

Endpoints

- Lab Request

    - Lista Todos - /labrequest/list get
    - Consulta Especifica - /labrequest/{id} get
    - Insertar - /labrequest/add post {"date": "2019-01-01 16:41", "name":"Practica", "labid": "1", "asign":"Thisshit", "teacherid": "1", "facultyid":"1", "students":"10", "cantmachines":"5", "cantconsume": "50", "observation": "observation", "usemachines": "true", "useconsume": "false", "guide": "true"}
    - Editar - /labrequest/edit/{id} put {"date": "2019-01-01 16:41", "name":"Practica", "labid": "1", "asign":"Thisshit", "teacherid": "1", "facultyid":"1", "students":"10", "cantmachines":"5", "cantconsume": "50", "observation": "observation", "usemachines": "true", "useconsume": "false", "guide": "true"}