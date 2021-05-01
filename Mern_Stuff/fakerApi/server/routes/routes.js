const controller = require('../controllers/controller');
module.exports= app=>{
        app.post('/api',controller.createFake);
        app.get('/api',controller.getFake );
        app.delete('/api/:id',controller.deleteFake);


}