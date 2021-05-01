const FakeThing=required('../models/model');
module.exports ={
    createFake:(req,res)=>{res.json(req.body);},
    
    getFake: (req,res)=> {
        let newFakeThing = new FakeThing();
        res.json(newFakeThing
    };
    
    deleteFake: (req,res)=> { let deletedId = req.params.id;
    res.json({message:`Deleted the item with id: $(deletedId)`});
    }

}