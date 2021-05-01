const faker= require('faker');

class FakeThing{
    constructor(){
    this.firstName = faker.name.firstName();
    this.lastName = faker.name.lastName();
    this.company = faker.company.company();
    }
}

module.exports= Fakething