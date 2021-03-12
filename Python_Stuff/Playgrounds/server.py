from flask import Flask, render_template  # added render_template!


app = Flask(__name__)                     
    
@app.route('/play/')  
@app.route('/play/<int:num>/')  
@app.route('/play/<int:num>/<color>/')                           
def box(num=3, color ="blue"):
    return render_template('index.html',color = color,num = num)  

if __name__=="__main__":
    app.run(debug=True)                   
