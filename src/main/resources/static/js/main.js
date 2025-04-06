function deleteProduct(endpoint, id){
    if(confirm("Bạn muốn xóa?") === true){
        fetch(`${endpoint}/${id}`, {
        method: "delete"
    }).then(res => {
        if(res.status === 204){
            alert("Xóa thành công!");
            location.reload();
        }
        else
            alert("Lỗi hệ thống!");
        
        });
    }
}
