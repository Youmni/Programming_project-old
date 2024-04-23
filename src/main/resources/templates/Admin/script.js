// Sidemenu tabs
const sideMenu = document.querySelectorAll("#sidebar .side-menu li ")
const contentDashboard = document.getElementById('content-dashboard')
const contentInventaris = document.getElementById('content-inventaris')
const text = document.querySelectorAll('#sidebar .side-menu span')

sideMenu.forEach(item => {
    const li = item;
    li.addEventListener('click', function(){
        sideMenu.forEach(li =>{
            li.classList.remove('active');
        })
        text.forEach(i =>{
            contentDashboard.classList.add('active-content')
            contentInventaris.classList.add('active-content')
        })
        li.classList.add('active');
        const currentTab = li.lastElementChild.innerText
        console.log(currentTab)
        if(currentTab === "Dashboard"){
            contentDashboard.classList.remove('active-content')
        }else if(currentTab === "Inventaris"){
            contentInventaris.classList.remove('active-content')
        }
    })
});

// Toggle sidebar
const toggleButton = document.querySelector(".toggle-button")
const sideBar = document.getElementById('sidebar')

toggleButton.addEventListener('click', function(){
    sideBar.classList.toggle('hide')
    toggleButton.classList.toggle('hide')
})


// test
// andere test
