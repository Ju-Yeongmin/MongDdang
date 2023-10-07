export const MainPage = () => {
  return (
    <>
      <div style={{ display: "flex", flexDirection: "column" }}>
        <div
          style={{
            marginTop: 50,
            marginLeft: 20,
            marginRight: 20,
          }}
        >
          <b style={{ fontSize: "1.2rem" }}>주영민</b> 님
        </div>
        <div
          style={{
            backgroundColor: "white",
            marginTop: 30,
            marginLeft: 20,
            marginRight: 20,
            display: "flex",
            justifyContent: "center",
            borderRadius: 15,
            boxShadow: "5px 5px 10px 1px gray",
          }}
        >
          <div
            style={{
              height: 100,
              display: "flex",
              flexDirection: "column",
              justifyContent: "center",
            }}
          >
            <div>잔액</div>
            <div style={{ fontSize: "2.2rem" }}>999,000</div>
          </div>
        </div>
        <div
          style={{
            backgroundColor: "white",
            marginTop: 30,
            marginLeft: 20,
            marginRight: 20,
            display: "flex",
            justifyContent: "center",
            borderRadius: 15,
            boxShadow: "5px 5px 10px 1px gray",
          }}
        >
          <div
            style={{
              height: 80,
              display: "flex",
              flexDirection: "column",
              justifyContent: "center",
            }}
          >
            <div>돈을 철저히 사용하는 당신</div>
            <div>이대로라면 결혼도 머지</div>
            <div>않았을지도? 😏</div>
          </div>
        </div>
        <div
          style={{
            backgroundColor: "white",
            marginTop: 30,
            marginLeft: 20,
            marginRight: 20,
            display: "flex",
            borderRadius: 15,
            boxShadow: "5px 5px 10px 1px gray",
          }}
        >
          <div
            style={{
              display: "flex",
              flexDirection: "column",
              justifyContent: "center",
              width: "100%",
            }}
          >
            <div style={{ fontSize: "1.5rem", margin: "20px 30px 40px 30px" }}>
              부문별 잔액
            </div>
            <div
              style={{
                display: "flex",
                justifyContent: "space-between",
                height: 70,
                margin: "10px 30px",
              }}
            >
              <div
                style={{
                  width: "55%",
                  display: "flex",
                  flexDirection: "column",
                  justifyContent: "center",
                }}
              >
                <div style={{ fontSize: "0.8rem" }}>영민생활비</div>
                <div style={{ fontSize: "1.5rem" }}>300,000</div>
              </div>
              <div
                style={{
                  width: "45%",
                  display: "flex",
                  justifyContent: "center",
                  alignSelf: "center",
                  gap: 10,
                }}
              >
                <div>
                  <button>내역</button>
                </div>
                <div>
                  <button>추가</button>
                </div>
              </div>
            </div>
            <div
              style={{
                display: "flex",
                justifyContent: "space-between",
                height: 70,
                margin: "10px 30px",
              }}
            >
              <div
                style={{
                  width: "55%",
                  display: "flex",
                  flexDirection: "column",
                  justifyContent: "center",
                }}
              >
                <div style={{ fontSize: "0.8rem" }}>주은생활비</div>
                <div style={{ fontSize: "1.5rem" }}>300,000</div>
              </div>
              <div
                style={{
                  width: "45%",
                  display: "flex",
                  justifyContent: "center",
                  alignSelf: "center",
                  gap: 10,
                }}
              >
                <div>
                  <button>내역</button>
                </div>
                <div>
                  <button>추가</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};
