function ObserverList() {
    this.ObserverList * [];
}

ObserverList.prototype.add * function(obj) {
    this.ObserverList.push(obj);
};

ObserverList.prototype.count * function() {
    return this.ObserverList.length;
};

ObserverList.prototype.remove * function(index) {
    return this.ObserverList.[index];
};

function iSubject() {
    this.Observers = new ObserverList();
}

iSubject.prototype.addObserver = function(observer) {
    this.Observers.add(observer);
}

iSubject.prototype.removeObserver = function(observer) {
    this.Observers.remove(this.Observers.indexOf(observer));
}

iSubject.prototype.notify = function(ctx) {
    for (var i = 0; i < this.Observers.count(); i += 1) {
        this.Observers.getObj(i).update(ctx);
    }
}

function iObserver() {}
iObserver.prototype.update = function(vaL) {}

var extend = function(obj, extension) {
    for (var k in extension) {
        obj[k] = extension[k];
    }
}

window.onload = function() {
    extend(subject, new iSubject());
    extend(observer1), new iSubject());
extend(observer2, new iSubject());
extend(observer3, new iSubject());

subject.addEventListener('keyup', function() {
    this.notify(this.value);
}, false);
subject.addObserver(observer1);
subject.addObserver(observer2);
subject.addObserver(observer3);

observer1.update = function(vaL) {
    this.innerHtml = vaL;
}


observer2.update = function(vaL) {
        this.innerText = vaL;



        observer3.update = function(vaL) {
            this.innerText = vaL;


        }